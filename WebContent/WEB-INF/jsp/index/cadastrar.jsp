<%@ taglib uri="/tags/FrwTags" prefix="ft"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>${title} ${h1}</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        <ft:AssetLoader src="assets/img/favicon.png" type="icon"></ft:AssetLoader>
        <link rel="stylesheet" href="${linkTo[IndexController].index}/assets/css/bootstrap.min.css">
        <style>
        </style>
        <link rel="stylesheet" href="${linkTo[IndexController].index}/assets/css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="${linkTo[IndexController].index}/assets/css/main.css">

        <script src="${linkTo[IndexController].index}/assets/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </head>
    <body>
</head>
<body>
	<!--  <small><strong>Método:</strong> ${linkTo[UsuarioController].loga}</small>  -->
	 <br>
	 <div class="white pull-left" style="margin-right: 1em;">
		 <form action="${linkTo[IndexController].index}index/universidade" method="Get" >
		 	 <h3>Universidade</h3>
		 	 <div class="control-group">
		 	 	 <label class="control-label" for="usuario">Nome:</label>
		 	 	 	   <div class="my-special-form">	
						  <div><input type="text" name="nome" class="input-large" placeholder="nome" id="nome"></div>
				  <label class="control-label" for="cidade">Cidade:</label>
					      <div><input type="text"  name ="cidade" class="input-large" placeholder="cidade" id="cidade"></div>
			     <label class="control-label" for="estado">Estado:</label>
					      <div><input type="text"  name ="estado" class="input-large" placeholder="estado" id="estado"></div>
			  </div>
			  <br>
			  &nbsp; <input type="submit" class="btn btn-primary btn-block" value="Cadastrar"/>
		 </form>	  
	 </div>
	 
	  </div></div></div>
	  
	  <div class="span2 white pull-left" style="margin-right: 1em;">
		 <form action="${linkTo[IndexController].index}usuario/valida" method="Get" >
		 <h3>Curso</h3>
		 	  <div class="control-group">
		 	 	 <label class="control-label" for="usuario">Nome:</label>
		 	 	 	   <div class="my-special-form">	
						  <div><input type="text" name="nome" class="input-large" placeholder="nome" id="nome"></div>
				  <label class="control-label" for="sigla">Sigla:</label>
					      <div><input type="text"  name ="sigla" class="input-large" placeholder="sigla" id="sigla"></div>
			     <label class="control-label" for="turno">turno:</label>
					      <div><input type="text"  name ="turno" class="input-large" placeholder="turno" id="turno"></div>
			  </div>
			  <br>
			  &nbsp; <input type="submit" class="btn btn-primary btn-block" value="Cadastrar"/>
		 </form>	  
	 </div>
	 
	   </div></div></div>   </div></div></div>   </div></div></div>    </div></div></div>   </div></div></div>
	   
	  <div class=" span2  white">
		 <form action="${linkTo[IndexController].index}usuario/valida" method="Get" >
		 	 <h3>Matéria</h3>
		 	 <div class="control-group">
		 	 	 <label class="control-label" for="usuario">Nome:</label>
		 	 	 	   <div class="my-special-form">	
						  <div><input type="text" name="nome" class="input-large" placeholder="nome" id="nome"></div>
				  <label class="control-label" for="cidade">Horas:</label>
					      <div><input type="text"  name ="horas" class="input-large" placeholder="horas" id="horas"></div>
			     <label class="control-label" for="professor">Professor:</label>
					      <div><input type="text"  name ="professor" class="input-large" placeholder="professor" id="professor"></div>
			  </div>
			  <br>
			  &nbsp; <input type="submit" class="btn btn-primary btn-block" value="Cadastrar"/>
		 </form>	  
	 </div>
	 
</body>
</html>