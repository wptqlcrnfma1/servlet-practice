<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<h2>Hello World</h2>
	<h3>Hello World</h3>
	<h4>Hello World</h4>
	<h5>Hello World</h5>
	<h6>Hello World</h6>



	<table border = "1" cellspacing="0" cellpadding="10">
		<tr>
			<th>번호</th>
			<th>글제목</th>
			<th>글쓴이</th>
			<th>게시일</th>
		</tr>

		<tr>
			<td>1</td>
			<td>안녕</td>
			<td>둘리</td>
			<td>2020-01-30</td>
		</tr>

		<tr>
			<td>2</td>
			<td>이제는 안녕</td>
			<td>폴</td>
			<td>2020-01-30</td>
		</tr>

		<tr>
			<td>3</td>
			<td>이 말 도저히 할수가 없어</td>
			<td>킴</td>
			<td>2020-01-30</td>
		</tr>

	</table>

	<img src='/helloweb/images/김정석_온라인도장.png' style="width: 100px" />
	<br>
	<img src='images/김정석_온라인도장.png' style="width: 100px" />
	<br>
	<a href="form.jsp">폼으로 가기</a>
	<a href="index.jsp?n=안대혁">main으로 가기</a>

	<p>doGet() called doGet() called doGet() called doGet() called
		doGet() called doGet() called doGet() called doGet() called</p>

</body>
</html>