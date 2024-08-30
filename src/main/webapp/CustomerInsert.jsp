<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
}

form {
    background-color: #ffffff;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    margin: 100px auto;
    padding: 20px;
    width: 400px;
}

input[type="text"], input[type="password"], textarea {
    background-color: #f2f2f2;
    border: 1px solid #ddd;
    border-radius: 3px;
    margin-bottom: 10px;
    padding: 8px;
    width: 100%;
}

input[type="submit"] {
    background-color: #3498db;
    border: none;
    border-radius: 3px;
    color: white;
    cursor: pointer;
    font-size: 16px;
    margin-top: 10px;
    padding: 8px;
    width: 100%;
}

input[type="submit"]:hover {
    background-color: #258cd1;
}

image-gallery {
    text-align: left;
    margin-top: 15px;
    margin-bottom: 15px;
    display: block;
}



.visa{
  height:40px;
  width:60px;
  margin-right:10px;
}

.mastercard{
  height:40px;
  width:60px;
  margin-right: 10px;
}

.paypal{
  height:40px;
  width:60px;
  margin-right: 10px;
}

.american_express{
  height:50px;
  width:60px;
  margin-right: 10px;
}

</style>

</head>
<body>
	<form action = "insert" method = "post">
		CardHolderName:<input type = "text" name ="CardHolderName"><br>
		CardNumber:<input type = "text" name = "CardNumber" maxlength = 16><br>
		CVV:<input type = "password" name = "CVC" maxlength = 3>
		Expiry;<input type ="Date" name = "Expiry"><br>
		
		<input type = "Submit" value ="pay">
		
		
                    <img class="visa" src="https://cdn.freebiesupply.com/logos/large/2x/visa-2-logo-png-transparent.png" alt="Image 1">
                    <img class="mastercard" src="https://th.bing.com/th/id/OIP.8hSdZiAvNki23CzVyAvSLQHaEK?pid=ImgDet&rs=1" alt="Image 2">
                    <img class="paypal" src="https://th.bing.com/th/id/R.bd1419f2f730ef7ba64126743e0e391e?rik=uzFTmd6DoZgPdQ&riu=http%3a%2f%2flogok.org%2fwp-content%2fuploads%2f2014%2f05%2fPayPal-logo-20071.png&ehk=Lv0x8oYjHOwb0iyN03M6R%2fR6uaDne%2bj853%2b9DKrXFe8%3d&risl=&pid=ImgRaw&r=0" alt="Image 3">
                    <img class="american_express" src="https://th.bing.com/th/id/OIP.V0duj2DHUhxVJ4LEb2FodgHaEF?pid=ImgDet&rs=1" alt="image 4">
		
	</form>
</body>
</html>