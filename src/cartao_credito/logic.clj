(ns cartao_credito.logic
  (:require [cartao_credito.model :as c.model]
            [schema.core :as s]))


(s/defn cria-novo-cartao :- c.model/Cartao
  [numero :- s/Num
   cvv :- s/Num
   validade :- s/Str
   limite :- s/Num
   cliente-id :- s/Uuid
   ]
  {:id         (java.util.UUID/randomUUID)
   :numero     numero
   :cvv        cvv
   :validade   validade
   :limite     limite
   :cliente-id cliente-id
   })


(defn listar-cartoes [cartoes] cartoes)