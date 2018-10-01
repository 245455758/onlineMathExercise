package com.trouble.math.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@RequestMapping("q1")
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
				
			}
		}
		
		model.addAttribute("q1arr1", m1);
		model.addAttribute("q1arr2", m2);
		
		return "index";
	}

}
