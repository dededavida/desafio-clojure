(defproject desafio "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clojure.java-time "0.3.2"]
                 [prismatic/schema "1.1.12"]
                 [org.clojure/test.check "1.1.0"]
                 [nubank/matcher-combinators "3.3.0"]
                 [prismatic/schema-generators "0.1.3"]]

  :repl-options {:init-ns server}

  )
