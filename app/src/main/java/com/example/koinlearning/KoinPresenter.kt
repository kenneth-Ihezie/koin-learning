package com.example.koinlearning

class KoinPresenter(val presenter: KoinRepository, private val helloRepository: HelloRepository) {
    fun sayHello() = "${presenter.koinRepo()} from $this"
    fun fromHelloRepo() = "${helloRepository.giveHello()} from $this"
}