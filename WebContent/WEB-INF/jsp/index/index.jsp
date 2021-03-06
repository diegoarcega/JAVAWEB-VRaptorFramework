<%@ taglib uri="/tags/FrwTags" prefix="ft"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>${title}</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">
        <ft:AssetLoader src="assets/img/favicon.png" type="icon"></ft:AssetLoader>
		<ft:AssetLoader src="assets/css/bootstrap.min.css" type="css"></ft:AssetLoader>
		<ft:AssetLoader src="assets/css/bootstrap-responsive.min.css" type="css"></ft:AssetLoader>
		<ft:AssetLoader src="assets/css/main.css" type="css"></ft:AssetLoader>
		<ft:AssetLoader src="assets/css/jquery-ui-1.9.0.custom.min.css" type="css"></ft:AssetLoader>
		<ft:AssetLoader src="assets/css/frwtags.css" type="css"></ft:AssetLoader>
		<ft:AssetLoader src="assets/js/main.js" type="js"></ft:AssetLoader>
		<ft:AssetLoader src="assets/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js" type="js"></ft:AssetLoader>
		<ft:AssetLoader src="assets/js/jquery-1.8.2.js" type="js"></ft:AssetLoader>
		<ft:AssetLoader src="assets/js/jquery-ui-1.9.0.custom.min.js" type="js"></ft:AssetLoader>
		<ft:AssetLoader src="assets/js/frwtags.js" type="js"></ft:AssetLoader>
		<ft:AssetLoader src="assets/js/ajax_window.js" type="js"></ft:AssetLoader>
		</head>
<body>
		<div id="modal"></div>
		<div class="header-sys">
			<button class="btn" onclick="showWindow('university/add');">Universidade</button>
			<button class="btn" onclick="showWindow('course/add');">Curso</button>
			<button class="btn" onclick="showWindow('subject/add');">Mat�ria</button>
		</div>
		<div class="content-sys"></div>
		<div class="footer-sys"></div>
	</body>
</html>