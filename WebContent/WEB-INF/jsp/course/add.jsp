<%@ taglib uri="/tags/FrwTags" prefix="ft"%>

<ft:Window height="280" width="700" title="Curso Add">

	<ft:WindowField type="text" id="nome" name="course.nome" label="Nome"
		required="true" className="ClassCurso" value=""></ft:WindowField>
		
			<ft:WindowField type="text" id="sigla" name="course.sigla" label="sigla"
		required="true" className="ClassCurso" value=""></ft:WindowField>
		
			<ft:WindowField type="text" id="turno" name="course.turno" label="turno"
		required="true" className="ClassCurso" value=""></ft:WindowField>
	
	<ft:WindowButton id="Curso" className="CursoClass" label="Gravar" onClickEvent="saveCourse();"></ft:WindowButton>	
</ft:Window>
	 

	 