<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>

<meta charset="UTF-8">
<title>펜션</title>
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
	<p style="text-align:center; font-size: 30px;">펜션</p>
    <div class="container">      
        <div class="section">           	 
            <div class="image-description">
                <a href="${root }/pensionroom1">
                <img alt="" src="https://yaimg.yanolja.com/v5/2024/06/08/21/640/6664cc68404cd3.09603465.jpg">
                </a>
                <div class="description-text">
                    <h2>서귀포 돔그라미펜션</h2> 
                    <h2></h2>                  
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 제주특별자치도 표선면 표선리</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 064-787-9000</p>
                    <p><a href="https://jejudomgrami.com/" target="_blank">공식 홈페이지</a></p>
                </div>
            </div>
          </div>
         </div>
           
           <div class="container">      
        	<div class="section"> 
            <div class="image-description">
                <a href="${root }/pensionroom2">
                <img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4vfdVjTYkEIAdUESOKgc5mFnWxaNJGwt3jQ&s">  
               	</a>
                <div class="description-text">
                    <h2>부산 리벤시아 풀빌라</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 부산광역시 수영구 광안동 197-19 7층</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 051-374-9096</p>
                    <p><a href="http://xn--hc0bp1r8ub4weusch4khpe2a2816a.com/intro/intro.php" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>		
            </div>
            </div>
            
            <div class="container">      
        		<div class="section">
             <div class="image-description">
                <a href="${root }/pensionroom3">
                <img alt="" src="https://ldb-phinf.pstatic.net/20240618_119/1718685760942kdnEj_JPEG/%B5%B6%C3%A4%C6%E6%BC%C7_%BF%DC%BA%CE1.jpg?type=f750_420_60_sharpen">  
                </a>
                <div class="description-text">
                    <h2>광주 스테이더아람 B</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 광주광역시 광산구 박뫼길 20</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 010-6626-0315</p>
                    <p><a href="https://booking.naver.com/booking/3/bizes/996533" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>							
        </div>
    </div>
    
</body>
</html>