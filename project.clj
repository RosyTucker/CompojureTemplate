(defproject example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.9"]
                 [http-kit "2.1.5"]
                 [de.ubercode.clostache/clostache "1.4.0"]]
  :main main
  :profiles {:dev
              {:dependencies [[javax.servlet/servlet-api "2.5"]
                              [ring-mock "0.1.5"]]}
             :production
              {:dependencies [[javax.servlet/servlet-api "2.5"]]}})
