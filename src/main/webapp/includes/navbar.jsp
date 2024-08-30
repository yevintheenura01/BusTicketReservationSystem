<nav class="navbar navbar-expand-lg navbar-dark bg-secondary">
	<div class="container">
		<a class="navbar-brand" href="index.jsp">Bus Ticket Booking </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link" href="">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="">Cart <span class="badge badge-danger">${cart_list.size()}</span> </a></li>
			
				<li class="nav-item"><a class="nav-link" href="">Orders</a></li>
				<li class="nav-item"><a class="nav-link" href="">Logout</a></li>
				
				<li class="nav-item"><a class="nav-link" href="">Login</a></li>
				
			</ul>
		</div>
	</div>
</nav>