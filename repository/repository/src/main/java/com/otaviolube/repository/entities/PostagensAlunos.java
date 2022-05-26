package com.otaviolube.repository.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //Essa classe é conhecida como Embeddable, embutida, como um elemento embutido dentro do JPA 
public class PostagensAlunos implements Serializable{//implementar um item serializado A serialização é quando um objeto é transformado, em uma cadeia de bytes e desta forma pode ser manipulado de maneira mais fácil, seja através de transporte pela rede ou salvo no disco. Após a transmissão ou o armazenamento esta cadeia de bytes pode ser transformada novamente no objeto Java que o originou.
    
    @Column(name = "post_id")
    Long postId; 
    @Column(name = "author_id")
    Long authorId;

    // Sigo com a implementação dos demais atributos da classe 
    //posso criar atributos que estejam relacionados ao relacionamento e não ao author ou a postagem 
    int likes;

}
