package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized // permite que a classe e os atributos sejam lidos como json
@Data
@Builder // torna possível instaciar objetos sem todas as variáveis
@AllArgsConstructor
public class USDBRL {
    public String code;
    public String codein;
    public String name;
    public String high;
    public String low;
    public String varBid;
    public String pctChange;
    public String bid;
    public String ask;
    public String timestamp;
    public String create_data;
}
