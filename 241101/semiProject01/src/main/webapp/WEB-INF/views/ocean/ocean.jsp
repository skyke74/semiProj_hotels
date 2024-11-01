<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>

<meta charset="UTF-8">
<title>오션뷰</title>
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
        font-size: 25px;
        margin-bottm:30px;
        
        
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
	<p style="text-align:center; font-size: 30px;">오션뷰</p>
    <div class="container">      
        <div class="section">           	 
            <div class="image-description">
            <a href="${root }/oceanroom1">
                <img alt="" src="https://pix10.agoda.net/hotelImages/654/65460/65460_17021507500051032269.jpg?ca=6&ce=1&s=414x232&ar=16x9">
               	</a>
                <div class="description-text">
                    <h2>파라다이스 호텔 부산</h2>   
                    <h2></h2>                                    
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 부산광역시 해운대구 해운대해변로 296</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 051-742-2121</p>
                    <p><a href="https://www.busanparadisehotel.co.kr/front/" target="_blank">공식 홈페이지</a></p>
                </div>
            </div>
          </div>
         </div>
           
           <div class="container">      
        	<div class="section"> 
            <div class="image-description">
             <a href="${root }/oceanroom2">
                <img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1d3wr_RosvavXOAYXo4NfN276EsbchbY8xg&s">  
                	</a>
                <div class="description-text">
                    <h2>라비드 아틀란 호텔</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 부산광역시 해운대구 구남로 37</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 051-745-4200</p>
                    <p><a href="https://www.lavideatlanhotel2.com/" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>		
            </div>
            </div>
            
            <div class="container">      
        		<div class="section">
             <div class="image-description">
              <a href="${root }/oceanroom3">
                <img alt="" src="https://www.lottehotel.com/content/dam/lotte-hotel/global/common/company/busan-signiel.jpg">  
               	</a>
                <div class="description-text">
                    <h2>시그니엘 부산</h2>
                    <h2></h2>
                    <p><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 부산광역시 해운대구 달맞이길 30</p>
                    <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호 : 051-922-1000</p>
                    <p><a href="https://www.lottehotel.com/busan-signiel/ko.html" target="_blank">공식 홈페이지</a></p>
                </div>      	
            </div>							
        </div>
    </div>
    
</body>
</html>