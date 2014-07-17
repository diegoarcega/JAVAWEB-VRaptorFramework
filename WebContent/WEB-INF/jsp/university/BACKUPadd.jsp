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
	 <div class="white">
		 <form action="${linkTo[IndexController].index}university/save" method="Get" >
		 	 <h3>Universidade</h3>
		 	 <div class="control-group">
		 	 	 <label class="control-label" for="nome">Nome:</label>
		 	 	 	   <div class="my-special-form">	
						  <div><input type="text" name="university.nome" class="input-large" placeholder="nome" id="nome"></div>
				  <label class="control-label" for="cidade">Cidade:</label>
					      <div><input type="text"  name ="university.cidade" class="input-large" placeholder="cidade" id="cidade"></div>
			     <label class="control-label" for="estado">Estado:</label>
					      <div><input type="text"  name ="university.estado" class="input-large" placeholder="estado" id="estado"></div>
			  </div>
			  <br>
			  &nbsp; <input type="submit" class="btn btn-primary btn-block" value="Cadastrar"/>
		 </form>	  
	 </div>
	 
	 
</body>
</html>