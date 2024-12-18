<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이 페이지</title>
<%@include file="../css/mypage_css.jspf"%>
<%@include file="../template/head.jspf"%>
</head>
<body>
<%@include file="../template/menu.jspf"%>
<%@include file="../template/myInfo.jspf"%>

	<h1>예약한 숙소 </h1>
	<div class="jumbotron section">
		<div class="container">
			<div class="row">
				<c:forEach items="${resvList }" var="bean">
					<div class="col-xs-6 col-md-3">
						<a data-toggle="modal" data-target="#myModal" class="thumbnail">
							<img src="${bean.image_url1 }" alt="${bean.hotel_name} ">
							<p>${bean.hotel_name }</p>
						</a>
					</div>
				<%@include file="./resv_detail.jspf"%>
				</c:forEach>
			</div>
		</div>
	</div>
<script type="text/javascript">
$('.cancel').click(function(e){
 	e.preventDefault();
	 removeResv();
 });
</script>
	<h1>즐겨찾기 </h1>
	<div class="jumbotron section">
		<div class="container">
			<div class="row">
				<c:forEach items="${favList }" var="bean">
					<div class="col-xs-6 col-md-3">
						<a href="hotel_detail/${bean.hotel_id }/re" class="thumbnail">
							<img src="${bean.image_url1 }" alt="${bean.hotel_name} ">
							<p>${bean.hotel_name }</p>
						</a>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>

</body>
</html>