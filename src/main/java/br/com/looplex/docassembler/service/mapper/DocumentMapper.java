package br.com.looplex.docassembler.service.mapper;

import br.com.looplex.docassembler.model.Document;
import br.com.looplex.docassembler.service.form.DocumentForm;

public interface DocumentMapper {

    public Document dtoToEntity(DocumentForm documentForm);

}
