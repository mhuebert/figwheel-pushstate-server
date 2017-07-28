(defproject figwheel-pushstate-server "0.1.2"
  :description "Figwheel ring handler to support pushstate routes"
  :url "https://github.com/mhuebert/figwheel-pushstate-server"
  :license "MIT"
  :dependencies [[ring "1.4.0"]
                 [ring/ring-defaults "0.2.0"]
                 [ring/ring-core "1.6.0"]
                 [compojure "1.5.0"]]
  :deploy-via :clojars
  :src-paths ["src"])