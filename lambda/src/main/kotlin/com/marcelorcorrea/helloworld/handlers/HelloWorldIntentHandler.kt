package com.marcelorcorrea.helloworld.handlers

import com.hp.kalexa.core.annotation.Intent
import com.hp.kalexa.core.intent.IntentHandler
import com.hp.kalexa.model.request.AlexaRequest
import com.hp.kalexa.model.request.IntentRequest
import com.hp.kalexa.model.response.AlexaResponse
import com.hp.kalexa.model.response.dsl.alexaResponse

class HelloWorldIntentHandler : IntentHandler {

    @Intent(mapsTo = ["HelloWorldIntent"])
    override fun onIntentRequest(alexaRequest: AlexaRequest<IntentRequest>): AlexaResponse {
        val speechText = "Hello world"
        return alexaResponse {
            response {
                speech { speechText }
                simpleCard {
                    title = "Hello World"
                    content = speechText
                }
            }
        }
    }

}