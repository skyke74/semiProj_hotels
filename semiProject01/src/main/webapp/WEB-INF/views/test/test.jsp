<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hotel Booking</title>
    <link rel="stylesheet" type="text/css" href="test.css">
</head>
<body>
    <div class="header">
        <h1>Welcome to Dream Hotels</h1>
        <p>Find and book the best hotels around the world</p>
    </div>
    
    <div class="booking-section">
        <form action="search.jsp" method="get">
            <label for="location">Location:</label>
            <input type="text" id="location" name="location" placeholder="City, landmark, or hotel name" required>

            <label for="checkin">Check-In:</label>
            <input type="date" id="checkin" name="checkin" required>

            <label for="checkout">Check-Out:</label>
            <input type="date" id="checkout" name="checkout" required>

            <label for="guests">Guests:</label>
            <select id="guests" name="guests">
                <option value="1">1 Guest</option>
                <option value="2">2 Guests</option>
                <option value="3">3 Guests</option>
                <option value="4">4 Guests</option>
            </select>

            <button type="submit">Search Hotels</button>
        </form>
    </div>
</body>
</html>
