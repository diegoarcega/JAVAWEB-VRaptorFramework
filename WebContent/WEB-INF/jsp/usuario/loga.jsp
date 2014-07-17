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
		 <form action="${linkTo[IndexController].index}usuario/valida" method="Get" >
		 	 <img src="${linkTo[IndexController].index}assets/img/photo.jpg" class="avatar"/>
		 	 <div class="control-group">
		 	 	 <label class="control-label" for="usuario">Usuário:</label>
		 	 	 	   <div class="my-special-form">	
						  <div><input type="text" name="usuario" class="input-large" placeholder="Usuário" id="usuario"></div>
				  <label class="control-label" for="senha">Senha:</label>
					      <div><input type="password"  name ="senha" class="input-large" placeholder="Senha" id="senha"></div>
			  </div>
			  <br>
			  &nbsp; <input type="submit" class="btn btn-primary btn-large" value="Cadastre-me agora!"/>
		 </form>	  
	 </div>
	 
</body>
</html>