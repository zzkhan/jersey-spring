package com.zkbizz.ddm.data;

import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SampleEntity {

    public SampleEntity() {
    }

    public SampleEntity(Long id, String field1, String field2) {
        this.id = id;
        this.field1 = field1;
        this.field2 = field2;
    }

    @JsonProperty
    private Long id;
    @JsonProperty
    private String field1;
    @JsonProperty
    private String field2;
}
