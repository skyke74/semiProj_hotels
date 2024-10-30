<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>

<meta charset="UTF-8">
<title>관광명소</title>
<style>
    body {
        font-family: Arial, sans-serif; /* 기본 글꼴 설정 */
        line-height: 1.6;
    }

    .container {
        display: flex;
        justify-content: space-around;
        margin: 20px;
        gap: 20px; /* 섹션 사이 간격 추가 */
    }

    .section {
        width: 100%;
        border: 1px solid #000;
        padding: 10px;
        box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
    }

    .image-description {
        display: flex;
        align-items: top;
        margin-bottom: 30px;
    }

    .image-description img {
        width: 48%; /* 이미지 크기 조정 */
        height: auto;
        margin-right: 20px; /* 텍스트와의 간격 */
    }

    .description-text {
        flex-grow: 1; /* 텍스트 영역이 이미지 옆에서 확장되도록 */
    }

    h2 {
        margin: 0;
        font-size: 1.2em;
    }
    p{
    	font-size: 20px;
    }
    
    .title-container {
    display: flex;
    align-items: center;
}

.title-container p {
    margin-right: 50px;
}

</style>
<%@include file="../template/head.jspf" %>
</head>
<body>
<%@ include file="../template/menu.jspf" %>

    <div class="container">
        <!-- 국내 관광명소 섹션 -->
        <div class="section">
        	<div class="title-container">
            	<p><c:out value="${loc_name =='all'?'전국':loc_name}"/>의 관광명소</p> 
            </div>
            <c:forEach items="${list }" var="bean">
	            <div class="image-description">
	                <img alt="${bean.attraction_name }" src="${bean.image_url }">
	                <div class="description-text">
	                    <h2>${bean.attraction_name }</h2>
	                    <p>특징 : ${bean.features }</p>
	                    <p>주소 : ${bean.address }</p>
	                     <p><a href="${bean.homepage }" target="_blank">공식 홈페이지</a></p>
	                </div>
	            </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>
