<%@ taglib uri="/tags/FrwTags" prefix="ft"%>

<ft:Window height="280" width="700" title="Matéria add">

	<ft:WindowField type="text" id="nome" name="subject.nome" label="Nome"
		required="true" className="ClassMateria" value=""></ft:WindowField>
		
	<ft:WindowField type="text" id="horas" name="subject.horas" label="horas"
				required="true" className="ClassMateria" value=""></ft:WindowField>
		
	<ft:WindowField type="text" id="professor" name="subject.professor" label="professor"
					required="true" className="ClassMateria" value=""></ft:WindowField>
	
	<ft:WindowButton id="Materia" className="MateriaClass" label="Gravar" onClickEvent="saveSubject();"></ft:WindowButton>	
</ft:Window>
	 

	 