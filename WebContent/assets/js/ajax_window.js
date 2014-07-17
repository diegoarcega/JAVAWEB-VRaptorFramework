function saveCourse() {
	$.ajax({
		url : "course/save",
		type: "Post",
		data : {
			"course.nome" : $("input[name='course.nome']").val(),
			"course.sigla" : $("input[name='course.sigla']").val(),
			"course.turno" : $("input[name='course.turno']").val()
		},
		success : function(data) {
			alert('Cadastro realizado com sucesso!');
		},
		fail : function() {
			alert('Erro no cadastro!');
		}
	});

}

function saveUniversity() {
	$.ajax({
		url : "university/save",
		type: "Post",
		data : {
			"university.nome" : $("input[name='university.nome']").val(),
			"university.cidade" : $("input[name='university.cidade']").val(),
			"university.estado" : $("input[name='university.estado']").val()
		},
		success : function(data) {
			alert('Cadastro realizado com sucesso!');
		},
		fail : function() {
			alert('Erro no cadastro!');
		}
	});

}

function saveSubject() {
	$.ajax({
		url : "subject/save",
		type: "Post",
		data : {
			"subject.nome" : $("input[name='subject.nome']").val(),
			"subject.horas" : $("input[name='subject.horas']").val(),
			"subject.professor" : $("input[name='subject.professor']").val()
		},
		success : function(data) {
			alert('Cadastro realizado com sucesso!');
		},
		fail : function() {
			alert('Erro no cadastro!');
		}
	});

}


