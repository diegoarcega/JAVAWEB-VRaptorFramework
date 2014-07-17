<%@ taglib uri="/tags/FrwTags" prefix="ft"%>

<ft:Window height="280" width="700" title="Universidade Add">

	<ft:WindowField type="text" id="nome" name="university.nome" label="Nome"
		required="true" className="ClassUniversidade" value=""></ft:WindowField>
		
			<ft:WindowField type="text" id="cidade" name="university.cidade" label="cidade"
		required="true" className="ClassUniversidade" value=""></ft:WindowField>
		
			<ft:WindowField type="text" id="estado" name="university.estado" label="estado"
		required="true" className="ClassUniversidade" value=""></ft:WindowField>
	
	<ft:WindowButton id="universidade" className="universidadeClass" label="Gravar" onClickEvent="saveUniversity();"></ft:WindowButton>	
</ft:Window>
	 
