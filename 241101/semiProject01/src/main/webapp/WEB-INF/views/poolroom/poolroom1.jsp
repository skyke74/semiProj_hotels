<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>실내수영장숙소1</title>
<style>
    body {
        font-family: Arial, sans-serif; /* 기본 글꼴 설정 */
        line-height: 1.6;
    }

    .container {
        display: flex;
        justify-content: space-around;
        margin: 10px;
        gap: 0px; /* 섹션 사이 간격 추가 */
        width:100%;
        background-color: transparent;
    }

    .section {
        width: 100%;
        border: 1px solid transparent;
        padding: 20px;
      
    }
    
     .title-container {
        margin-bottom: 8px; /* 이미지와 제목 사이 간격 조정 */
    }

    .image-description {
        display: flex;
        align-items: top;
        margin-bottom: 100px;
    }

    .image-description img {
        width: 300px; /* 이미지 크기 조정 */
        height: 300px;
        margin-right: 30px; /* 텍스트와의 간격 */
    }

    .description-text {
        flex-grow: 1; /* 텍스트 영역이 이미지 옆에서 확장되도록 */
    }
    
    .hotel-info-title {
    font-size: 24px; /* 제목 크기 설정 */
    margin-bottom: 10px; /* 경계와의 간격 설정 */
    padding-bottom: 10px; /* 경계와의 간격 설정 */
    border-bottom: 2px solid #000; /* 아래 경계 추가 */
    margin-left: 20px;
}
    
    .description-text,
	.description-text2 {
   
    margin-left: 40px; /* 왼쪽 간격 설정 (선택 사항) */
    margin-right: 10px; /* 오른쪽 간격 설정 (선택 사항) */
    
}
	.description-text3,
	.description-text4
	{
		 margin-left: 50px;
		  margin-right: 50px;
	}
	
    
    
    p{
    	margin-right:20px;
    	font-size: 30px;
    	margin-bottom:20px;
    }
    
    .title-container {
    display: flex;
    align-items: left;
}

.title-container p {
    margin-right: 60px;
}

label{
  	font-size: 20px;
  }
  
</style>
	<%@include file="../template/head.jspf" %>
</head>
	
<body>
	<%@ include file="../template/menu.jspf" %>
	
	 <p class="hotel-info-title">&nbsp;&nbsp;호텔정보</p>
    <div class="container"> 
       <div class="section"> 
        	 <div class="title-container">
            <p>&nbsp;&nbsp; 부산 롯데호텔</p>
            </div> 
              <div class="image-description">
                <img alt="" src="https://cf.bstatic.com/xdata/images/hotel/max1024x768/416034300.jpg?k=99fb58a2483cb9bba0aee57607c96b199fe68755c22dffe3f6f6df57721d5413&o=&hp=1">
               	<img alt="" src="https://www.lottehotel.com/content/dam/lotte-hotel/lotte/busan/main/6470-1-2000-mai-LTBU.jpg.thumb.768.768.jpg">
                <div class="description-text"> 
                	 
                    <p><span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;특징</p>
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-star" aria-hidden="true"></span><span class="glyphicon glyphicon-star" aria-hidden="true"></span><span class="glyphicon glyphicon-star" aria-hidden="true"></span><span class="glyphicon glyphicon-star" aria-hidden="true"></span><span class="glyphicon glyphicon-star" aria-hidden="true"></span>&nbsp;</p>                                
                    <p style="font-size:16px;"><span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span>&nbsp; 주소 : 부산광역시 부산진구 가야대로 772</p>
                    <p style="font-size:16px;"><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>&nbsp; 전화번호: 051-810-1000</p>                    
                </div>          
            </div>
     
           
         <div class="title-container">
            <p>객실</p> 
            </div>
              <div class="image-description">
                <img alt="" src="https://www.lottehotel.com/content/dam/lotte-hotel/city/myeongdong/accommodation/standard/180708-1-2000-acc-myeongdong-city.jpg.thumb.1920.1920.jpg">
                    <div class="description-text">
                    <p>&nbsp; 스탠다드룸</p>  
                    <p> &nbsp;</p>                 
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-bed" aria-hidden="true"></span>&nbsp; 객실수 : 2</p>  
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-credit-card"></span>&nbsp; 가격 : 312000원</p>
                    <p> &nbsp;</p>
                   	<p style="font-size:20px;"><span class="glyphicon glyphicon-bell" aria-hidden="true"></span><a href="Order1" type="button"> 예약하기</a></p>
               		</div>
                </div>
                
                <div class="image-description">
                <img alt="" src="https://www.lottehotel.com/content/dam/lotte-hotel/lotte/seoul/accommodation/main-tower/standard/deluxe/181107-9-2000-roo-LTSE.jpg.thumb.1920.1920.jpg">
                    <div class="description-text">
                    <p>&nbsp; 디럭스룸</p>  
                    <p> &nbsp;</p>                                  
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-bed" aria-hidden="true"></span>&nbsp; 객실수 : 2</p>  
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-credit-card"></span>&nbsp; 가격 : 459800원</p>
                   	<p> &nbsp;</p>
                   	<p style="font-size:20px;"><span class="glyphicon glyphicon-bell" aria-hidden="true"></span><a href="Order1" type="button"> 예약하기</a></p>
                </div>
                
            </div>
            
                <div class="image-description">
                <img alt="" src="https://www.lottehotel.com/content/dam/lotte-hotel/lotte/seoul/accommodation/executive-tower/standard/premier-room/181026-12-2000-roo-LTSE.jpg.thumb.768.768.jpg">
                    <div class="description-text">
                    <p>&nbsp; 프리미엄룸</p> 
                    <p> &nbsp;</p>                              
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-bed" aria-hidden="true"></span>&nbsp; 객실수 : 2</p>  
                    <p style="font-size:20px;"><span class="glyphicon glyphicon-credit-card"></span>&nbsp; 가격 : 780000원</p>
               		<p> &nbsp;</p>
                   	<p style="font-size:20px;"><span class="glyphicon glyphicon-bell" aria-hidden="true"></span><a href="Order1" type="button"> 예약하기</a></p>
                </div>
            </div>
            
            
       </div>
        </div>  
</body>
</html>