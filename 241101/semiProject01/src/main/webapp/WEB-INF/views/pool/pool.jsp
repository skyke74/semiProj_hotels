<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>

<meta charset="UTF-8">
<title>실내수영장</title>
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
	<p style="text-align:center; font-size:30px;">실내수영장</p>
    <div class="container">      
        <div class="section">           	 
            <div class="image-description">
                <a href="${root }/poolroom1">
                <img alt="" src="https://cf.bstatic.com/xdata/images/hotel/max1024x768/416034300.jpg?k=99fb58a2483cb9bba0aee57607c96b199fe68755c22dffe3f6f6df57721d5413&o=&hp=1">
                </a>
                <div class="description-text">
                    <h2>부산 롯데호텔</h2> 
                    <h2></h2>                  
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 부산광역시 부산진구 가야대로 772</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 051-810-1000</p>
                    <p><a href="https://www.lottehotel.com/busan-hotel/ko.html" target="_blank">공식 홈페이지</a></p>
                </div>
            </div>
          </div>
         </div>
           
           <div class="container">      
        	<div class="section"> 
            <div class="image-description">
                <a href="${root }/poolroom2">
                <img alt="" src="https://cf.bstatic.com/xdata/images/hotel/max1024x768/251019186.jpg?k=e01d8769db95d541a30887015cb2a0888d53eaa73d5d2641ce1a31ce55c82c75&o=&hp=1">  
                </a>
                <div class="description-text">
                    <h2>서울 신라호텔</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 서울특별시 중구 동호로 249</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 02-2233-3131</p>
                    <p><a href="https://www.shilla.net/seoul/index.do" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>		
            </div>
            </div>
            
            <div class="container">      
        		<div class="section">
             <div class="image-description">
                <a href="${root }/poolroom3">
                <img alt="" src="https://cf.bstatic.com/xdata/images/hotel/max1024x768/473082677.jpg?k=82a96cded3b03f7108453fc713e3df4f69f744f7ed0485897b017054999334fc&o=&hp=1">  
                </a>
                <div class="description-text">
                    <h2>다인 오세아노호텔</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 제주특별자치도 제주시 특별자치도, 애월읍 애월해안로 394</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 064-799-2600</p>
                    <p><a href="https://www.dyneresort.co.kr/" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>							
        </div>
    </div>
    
</body>
</html>