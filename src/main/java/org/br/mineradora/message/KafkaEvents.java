package org.br.mineradora.message;

import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.dto.QuotationDTO;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//acompanhar as cotações do dólar em relação ao real
@ApplicationScoped
public class KafkaEvents {
    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Channel("quotation-channel")
    Emitter<QuotationDTO> quotationRequestEmitter;
    public void sendNewKafkaEvent(QuotationDTO quotation) {
        LOG.info("...Enviando cotação para tópico kafka");
        quotationRequestEmitter.send(quotation).toCompletableFuture().join();
    }

}
