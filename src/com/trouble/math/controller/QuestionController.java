package com.trouble.math.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@RequestMapping("/q1")
	public String q1(Model model) {
		int[] m1 = new int[4];
		int[] m2 = new int[4];
		Random rand = new Random();
		for(int i=0;i<4;i++) {
			m1[i] = rand.nextInt(10);
			m2[i] = rand.nextInt(10);
		}
		int[][] q1Ans = new int[4][];
		
		int ans = rand.nextInt(4);
		q1Ans[ans] = new int[4];
		for (int i = 0; i < q1Ans[ans].length; i++) {
			q1Ans[ans][i] = m1[i]+m2[i]; 
		}
		for (int i = 0; i < q1Ans.length; i++) {
			if(i!=ans) {
				q1Ans[i] = new int[4];
				for (int j = 0; j < q1Ans[i].length; j++) {
					q1Ans[i][j] = q1Ans[ans][j]+rand.nextInt(3);
				}
			}
		}
		
		model.addAttribute("q1arr1", m1);
		model.addAttribute("q1arr2", m2);
		model.addAttribute("ans", ans);
		model.addAttribute("choices", q1Ans);
		return "index";
	}
	
	@RequestMapping("/q1Cri")
	public String q1Cri(Model model,String q1,String ans) throws Exception {
		System.out.println(q1);
		System.out.println(ans);
		boolean b = judge(q1, ans);
		System.out.println(b);
		model.addAttribute("q1judge", b);
		return "result";
	}
	
	
	public boolean judge(String ques,String ans) {
		boolean b = false;
		if("q1A".equals(ques)&&"0".equals(ans)) b=true;
		if("q1B".equals(ques)&&"1".equals(ans)) b=true;
		if("q1C".equals(ques)&&"2".equals(ans)) b=true;
		if("q1D".equals(ques)&&"3".equals(ans)) b=true;
		
		return b;
	}

}
