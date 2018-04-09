<%-- 
    Document   : mishra
    Created on : Apr 22, 2016, 2:39:22 PM
    Author     : de
--%>
<html>
    <head><title>Jack Shoping</title>
        <link href="bootstrap-3.2.0-dist/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/component.css" />
        <script src="jquery.min.js"></script>
        
        <script src="bootstrap-3.2.0-dist/js/bootstrap.min.js"></script>
      
        
        <style type="text/css"> 
    /*        {
                 background-color:lightseagreen;
            }*/
            .thumbnail {
                padding: 0 0 15px 0;
                border: none;
                border-radius: 0;
                }

            .thumbnail p {
                margin-top: 15px;
                color: #555;
               }
            #main1,#mains{
               background-color:#47a3da;
             
             
                
            }
            
            div#status{position:fixed; font-size:24px; z-index: 2;}
            
            @media screen and (max-width:20.5em)/* this for model*/
            {
                .big-box h2
                {
                    font-size: 12px;
                    width:100%;
                    height: 100%;
                    padding: 0;
                    margin: 0;                   
                }
            }
            .modal-dialog{
                width: 100%;
                height:100%;
                padding: 0;
                margin: 0;
            }
            .model-content{
                height:100%;
                border-radius: 0;
                color:white;
                overflow:auto;
                
            }
            .modal-title
            {
                font-size: 3em;
                font-weight: 300;
                margin: 0 0 20px 0; 
            }
            
            .modal-content-one
            {
                background-color:lightseagreen;
            }
            .close
            {
                color:white! important;
                opacity: 1.0;
            }/* this for model end*/
            
            #loader{
	margin-top:10px;
}
.sk-spinner-pulse.sk-spinner {
  width: 60px;
  height: 60px;
  margin: 0 auto;
  background-color: #333;
  border-radius: 100%;
  -webkit-animation: sk-pulseScaleOut 1s infinite ease-in-out;
  animation: sk-pulseScaleOut 1s infinite ease-in-out; 
}

@-webkit-keyframes sk-pulseScaleOut {
  0% {
    -webkit-transform: scale(0);
            transform: scale(0); }

  100% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0; } }

@keyframes sk-pulseScaleOut {
  0% {
    -webkit-transform: scale(0);
            transform: scale(0); }

  100% {
    -webkit-transform: scale(1);
            transform: scale(1);
    opacity: 0; } }
            #fat-btn{
                position: absolute;
                top:7%;
                left: 87%;
            }
            #m1{
                width: 70%;
                height: 100%; 
                padding-left: 290px;
                z-index: -1;
                box-shadow: 2px 2px 2px rgba(0,0,0,0.2);
            
            }
            #sm2{
                
                  height: 25%;  
                 }
             #sm1{
                 border-radius: 5px;
                 
                 } 
            #first-child
            {
                top:0;
                left:0;
                background-color:lightseagreen;
                color: black;
                height: 12%;
                box-shadow: 2px 2px 2px rgba(0,0,0,0.2);
               
            }
            ul.tabs {    /* this for manu*/
		margin: 0;
		padding: 0;
		float: left;
		list-style: none;
		height: 32px;
		border-bottom: 1px solid #999999;
		border-left: 1px solid #999999;
		width: 100%;
	}
	ul.tabs li {
		float: left;
		margin: 0;
		cursor: pointer;
		padding: 0px 21px ;
		height: 31px;
		line-height: 31px;
		border: 1px solid #999999;
		border-left: none;
		font-weight: bold;
		background: #EEEEEE;
		overflow: hidden;
		position: relative;
	}
	ul.tabs li:hover {
		background: #CCCCCC;
	}	
	ul.tabs li.active{
		background: #FFFFFF;
		border-bottom: 1px solid #FFFFFF;
	}
	.tab_container {
		border: 1px solid #999999;
		border-top: none;
		clear: both;
		float: left; 
		width: 100%;
		background: #FFFFFF;
	}
	.tab_content {
		padding: 20px;
		font-size: 1.2em;
		display: none;
	}/* this for manu ends*/
        
        </style>
    </head>
    <body>
        <div class="well" >
            <button data-toggle="modal" data-target="#modal1" id="fat-btn" class="btn btn-primary " data-loading-text="Loading..." type="button"> Loging state </button>
                    <div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="model-content modal-content-one">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">close</span></button>
                                    <h4 class="modal-title" id="myModalLabel">HI welcome to Login As Athuority of Admin</h4>
                                </div>
                                <div class="modal-body">
                                    <form role="form" method="post" action="LoginServlet">
                                        <div class="form-group col-xs-9">
                                            <label for="usr" class="col-sm-2 control-label">Admin ID:</label>
                                            <input type="text" class="form-control" name="username" >
                                        </div>
                                    <div class="form-group col-xs-9">
                                        <label for="pwd" class="col-sm-2 control-label">Password:</label>
                                        <input type="password" class="form-control" name="pwd">
                                    </div><br>
                                    <div class="checkbox col-xs-9">
                                      <label><input type="checkbox"> Remember me</label>
                                    </div>
                                    <br>
                                    <div class="col-xs-12">
                                     <button type="submit" class="btn btn-default bottom-left">Submit</button>
                                    </div> </form>
                                    
                                    </div>
                        </div>
                    </div>
                </div>
            
             
            
                
   
      <div class="main" id="sm1">
				<nav id="cbp-hrmenu" class="cbp-hrmenu">
					<ul>
						<li>
							<a href="#"> MEN</a>
							<div class="cbp-hrsub" id="sm1" >
								<div class="cbp-hrsub-inner" > 
									<div>
										<h4 >Mens &amp; It clothes</h4>
										<ul id="activemanu">
											<li><a href="display.jsp?name=clothes">Blazer</a></li>
											<li><a href="display.jsp?name=men shirts">Formal shirts</a></li>
                                                                                        <li><a href="display.jsp?name=t-shirts">T-shirts</a></li>
											<li><a href="display.jsp?name=men clothes">Jeans</a></li>
											<li><a href="display.jsp?name=men pents">Formal pents</a></li>
                                                                                       
										
										</ul>
									</div>
									<div>
										<h4>Utilities</h4>
										<ul>
											 <li><a href="display.jsp?name=sports shoes">shoes</a></li>
                                                                                         <li><a href="#">Chain</a></li>
											<li><a href="#">Bracelet</a></li>
											<li><a href="#">watches</a></li>
											<li><a href="#">goggles</a></li>
											
										</ul>
									</div>
									<div>
										
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">Women</a>
							<div class="cbp-hrsub" id="sm1">
								<div class="cbp-hrsub-inner">
									<div>
									<h4>Education &amp; Learning</h4>
                                                                            <ul>
                                                                                <li><a href="#">Learn Thai</a></li>
										<li><a href="#">Math Genius</a></li>
										<li><a href="#">Chemokid</a></li>
                                                                            </ul>
                                                                        </div>
                                                                        <div>
										<h4>Beauty & Wellness</h4>
										<ul>
                                                                                    <li><a href="#">Kits & Combos</a></li>
                                                                                    <li><a href="#">Moneymaker</a></li>
                                                                                    <li><a href="display.jsp?name=sports shoes">Shoes</a></li>
                                                                                    <li><a href="display.jsp?name=women footwear">Sandale</a></li>
										</ul>
									</div>
									<div>
										<h4>Women's clothes</h4>
										<ul>
											<li><a href="display.jsp?name=women kurti">Women kurta& kurti</a></li>
											<li><a href="display.jsp?name=women jeans">Women Jeans</a></li>
											<li><a href="display.jsp?name=women dress">Women dress</a></li>
                                                                                        <li><a href="display.jsp?name=t-shirts">T-shirts</a></li>
											<li><a href="display.jsp?name=jewllery">Jewllery</a></li>
											
										</ul>
									</div>
									<!--<div>
										<h4> All jewellary</h4>
										<ul>
											<li><a href="display.jsp?name=jewllery">Rings</a></li>
											<li><a href="#">Snoopydoo</a></li>
											<li><a href="#">Fallen Angel</a></li>
											<li><a href="#">Sui Maker</a></li>
											<li><a href="#">Wave Master</a></li>
											<li><a href="#">Golf Pro</a></li>
										</ul>
									</div>-->
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">BOOKS</a>
							<div class="cbp-hrsub" id="sm1">
								<div class="cbp-hrsub-inner "> 
                                                                    <div>
										<h4>Book &amp; book</h4>
										<ul>
											<li><a href="#">Summer Reads</a></li>
											<li><a href="#">Academic & Professional</a></li>
                                                                                </ul></div></td>
                                                                                <div><h4>eBooks & ePrints</h4>
										<ul>
											<li><a href="#">Literature & Fiction</a></li>
											<li><a href="#">Comics & Graphic Novels</a></li>
											<li><a href="#">Biographies & Autobiography</a></li>
					
										</ul>
                                                                                    </div>
                                                                                    <div><h4>Education</h4>
										<ul>
											<li><a href="#">Java</a></li>
											<li><a href="#">C# microsoft</a></li>
											<li><a href="#">PHP Frame work</a></li>
										</ul>
									
                                                                                        </div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">HOME &  KITCHENS</a>
							<div class="cbp-hrsub"  id="sm1">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>KITCHEN</h4>
										<ul>
											<li><a href="display.jsp?name=pots">POTS</a></li>
											<li><a href="display.jsp?name=cooker">PRESSURE COOKER</a></li>
											<li><a href="display.jsp?name=Lunch Box">LUNCH BOXES</a></li>
											<li><a href="display.jsp?name=coffee mug">COFFEE MUGS</a></li>
											
                                                                                </ul></div>
                                                                    <div>
										<h4>BED & LIVING</h4>
										<ul>
											<li><a href="display.jsp?name=Bedsheet">BEDSHEETS</a></li>
											<li><a href="display.jsp?name=carpets">MATS & CARPETS</a></li>
										</ul>
									</div>
									<div>
										<h4>WALL DECORE</h4>
										<ul>
											<li><a href="display.jsp?name=wall clock ">CLOCKS</a></li>
											<li><a href="display.jsp?name=wall poster">WALL POSTERS</a></li>
										
											<li><a href="display.jsp?name=wall shelves">WALL SHELVES</a></li>
										
											
										</ul>
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
						<li>
							<a href="#">ELECTRONICS</a>
							<div class="cbp-hrsub"  id="sm1">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>mobile</h4>
										<ul>
											<li><a href="#">SAMSUNG</a></li>
											<li><a href="#">Micromax</a></li>
											<li><a href="#">Apple</a></li>
										</ul>
                                                                        </div>
									<div>
										<h4>Laptops</h4>
										<ul>
											<li><a href="#">HP</a></li>
											<li><a href="#">Dell</a></li>
									
                                                                                <h4>Tablet</h4>
										<ul>
											<li><a href="#">Lenovo</a></li>
											<li><a href="#">Asus</a></li>
										</ul>
									</div>
									<div>
										<h4>Computer Accesories</h4>
										<ul>
											<li><a href="#">Keyboard</a></li>
											<li><a href="#">Mouse</a></li>
											<li><a href="#">Pendrive</a></li>
											<li><a href="#">Hard Disk</a></li>
											
									
										</ul>
									</div>
								</div><!-- /cbp-hrsub-inner -->
							</div><!-- /cbp-hrsub -->
						</li>
                                                                                                    <li>
							<a href="#">About Us</a>
							<!--<div class="cbp-hrsub"  id="sm1">
								<div class="cbp-hrsub-inner"> 
									<div>
										<h4>mobile</h4>
										<ul>
											<li><a href="#">SAMSUNG</a></li>
											<li><a href="#">ASUS</a></li>
											<li><a href="#">MICROSOFT</a></li>
										</ul>
										<h4>Tablet</h4>
										<ul>
											
											<li><a href="#">Lenovo</a></li>
											<li><a href="#">Asus</a></li>
										</ul>
									</div>
									<div>
										<h4>Laptops</h4>
										<ul>
											<li><a href="#">HP</a></li>
											<li><a href="#">Dell</a></li>
										</ul>
									</div>-->
									
								</div>
         
                         </div>  
                
        <div class="container" id="super">
             <div class="row">
              <div id="myCarousel" class="carousel slide"> <!-- Carousel indicators --> 
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li> 
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li> 
            </ol> <!-- Carousel items -->
            <div class="carousel-inner" id="sm2" >
                <div class="item active" > 
                    <img src="images/1.png" alt="First slide" id="m1"> </div>
                <div class="item"> <img src="images/2.png" alt="Second slide" id="m1"> </div>
                <div class="item"> <img src="images/3.png" alt="Third slide" id="m1"> </div> 
            </div> <!-- Carousel nav -->
            <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a> 
            <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
        </div> 
            <div class="row text-center">
                <div class="col-xs-6 col-md-6 big-box " id="main1">
                    </div>  
                <div class="col-xs-6 col-md-6 big-box" id="mains">
                    </div>  
            </div>
                        <div id="loader">
        <div class="sk-spinner sk-spinner-pulse"></div>
</div>
                </div>
            
            <div class="row ">
            <div class="col-xs-12 col-md-12 big-box" id="div_b1" >
        <button type="button" class="btn btn-default btn-lg btn-block" id="b1"> See More</button>
            </div></div>
        </div>
        <script src="js/cbpHorizontalMenu.min.js"></script>
        <script>
           
		
			$(function() {
                           cbpHorizontalMenu.init();
                        
			});
                       var $body = $( 'body' );
                    $('#activemanu').addClass( 'cbp-hropen' );
                $body.on( 'load',open);
		</script>
        <script src="js/aj.js"></script>
        <script type="text/javascript">
          var   count = 1;
          var   countlast = 86;
            $("#myCarousel").carousel({ interval: 2000
                 });
                 $(".btn").click(function(){ 
                     $(this).button('loading').delay(500).queue(function() {  
                         $(this).button('reset'); }); });
                 
                 
         
            $('#b1').click(function(){
                $('#loader').show();
			setTimeout(function(){ 
				$('#loader').hide();
				getresult();
                                
			}, 3000);
                                });                    
   function changeColor(x)
{
   // alert();
  //$("#sm").hide();

}

        
        </script> 
		
    </body>
</html>
