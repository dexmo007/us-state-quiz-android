package com.dexpru.usquizzz

import com.beust.klaxon.Klaxon
import java.io.InputStream

class Quiz(resource: InputStream) {
    val states: List<State> = Klaxon().parseArray(resource)!!


}