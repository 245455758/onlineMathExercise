<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS_HTML"></script>

</head>
<body>

<form action="${pageContext.request.contextPath }/question/q1Cri.action" class = "form">
<h5>第一题</h5>
<p>请计算
\(
  \bigl( \begin{smallmatrix} ${q1arr1[0] } & ${q1arr1[1] } \\ ${q1arr1[2] } & ${q1arr1[3] } \end{smallmatrix} \bigr)
+
  \bigl( \begin{smallmatrix} ${q1arr2[0] } & ${q1arr2[1] } \\ ${q1arr2[2] } & ${q1arr2[3] } \end{smallmatrix} \bigr)
  \)
的值为:</p>
<p>
</p>
<input type="hidden" name="ans" value="${ans }"/>
<input type="radio" name="q1" value="q1A" />A:\(\bigl( \begin{smallmatrix} ${choices[0][0] } & ${choices[0][1] } \\ ${choices[0][2] } & ${choices[0][3] } \end{smallmatrix} \bigr)\)&nbsp;&nbsp;&nbsp;
<input type="radio" name="q1" value="q1B" />B:\(\bigl( \begin{smallmatrix} ${choices[1][0] } & ${choices[1][1] } \\ ${choices[1][2] } & ${choices[1][3] } \end{smallmatrix} \bigr)\)&nbsp;&nbsp;&nbsp;
<input type="radio" name="q1" value="q1C" />C:\(\bigl( \begin{smallmatrix} ${choices[2][0] } & ${choices[2][1] } \\ ${choices[2][2] } & ${choices[2][3] } \end{smallmatrix} \bigr)\)&nbsp;&nbsp;&nbsp;
<input type="radio" name="q1" value="q1D" />D:\(\bigl( \begin{smallmatrix} ${choices[3][0] } & ${choices[3][1] } \\ ${choices[3][2] } & ${choices[3][3] } \end{smallmatrix} \bigr)\)<br/>
<input type="submit" value="提交">

</form>
</body>
</html>