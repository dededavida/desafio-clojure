(ns cartao_credito.db
  (:require [cartao_credito.logic :as cartao.logic]
            [cliente.db :as cliente.logic]))

(def cartao1 (cartao.logic/cria-novo-cartao
               (java.util.UUID/randomUUID)
               2555
               155
               "07/28"
               5000
               (:cliente-id cliente.logic/cliente1)))

(def cartao2 (cartao.logic/cria-novo-cartao
               (java.util.UUID/randomUUID)
               2444
               144
               "08/29"
               6000
               (:cliente-id cliente.logic/cliente2)))

(def cartoes [cartao1 cartao2])









