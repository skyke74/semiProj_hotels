<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>

<meta charset="UTF-8">
<title>한옥</title>
<style>
    body {
        font-family: Arial, sans-serif; /* 기본 글꼴 설정 */
        line-height: 1.6;
    }

    .container {
        display: flex;
        justify-content: space-around;
        margin: 15px;
        gap: 0px; /* 섹션 사이 간격 추가 */
       
        
    }

     .section {
        width: 100%;
        height: 350px;
        border: 1px solid #000;
        padding: 10px;
        box-shadow: 2px 2px 5px rgba(0, 0, 0, 0.2);
         border-radius: 15px; /* 둥근 모서리 */
    }

    .image-description {
        display: flex;
        align-items: top;
        margin-bottom: 30px;
    }

    .image-description img {
        width: 500px; /* 이미지 크기 조정 */
        height: 320px;
        margin-right: 15px; /* 텍스트와의 간격 */
    }

    .description-text {
        flex-grow: 1; /* 텍스트 영역이 이미지 옆에서 확장되도록 */
    }

    h2 {
        margin: 10px;
        font-size: 15px;
        
        
    }
    p{
    	font-size: 18px;
    	
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
	<p style="text-align:center; font-size: 30px;">한옥</p>
    <div class="container">      
        <div class="section">           	 
            <div class="image-description">
                <a href="${root }/hanokroom1">
                <img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHT88KfI7To_VvPktGUINd9ZzgM1AnzTbnLw&s">
                </a>
                <div class="description-text">
                    <h2>한옥호텔 락고제</h2>   
                    <h2></h2>                
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 서울특별시 종로구 가회동 218</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 02-742-3410</p>
                    <p><a href="http://rkj.co.kr/" target="_blank">공식 홈페이지</a></p>
                </div>
            </div>
          </div>
         </div>
           
           <div class="container">      
        	<div class="section"> 
            <div class="image-description">
                <a href="${root }/hanokroom2">
                <img alt="" src="https://i.ytimg.com/vi/fY6capIJnyA/maxresdefault.jpg">  
               	</a>
                <div class="description-text">
                    <h2>한라궁 호텔</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 제주특별자치도 서귀포시 특별자치도, 토평동 정방연로</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 064-732-7900</p>
                    <p><a href="http://hallagung.com/index.php" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>		
            </div>
            </div>
            
            <div class="container">      
        		<div class="section">
             <div class="image-description">
                <a href="${root }/hanokroom3">
                <img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW6HaEQZ1yoez7uEiEexsDgOZy88vPpSJOwA&s">  
               	</a>
                <div class="description-text">
                    <h2>광주 다솜채 한옥스테이</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 광주광역시 광산구 송정동 내상로51번길 27</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 070-8831-7700</p>
                    <p><a href="http://www.dasomchae.net/" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>							
        </div>
    </div>
    
</body>
</html>