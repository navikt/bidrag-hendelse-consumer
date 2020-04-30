package no.nav.bidrag.hendelse.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BidragHendelseConsumer

fun main(args: Array<String>) {
    runApplication<BidragHendelseConsumer>(*args)
}
