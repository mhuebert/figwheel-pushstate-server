(ns figwheel-server.core
    (:require
      [clojure.java.io :as io]
      [compojure.core :as c]
      [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(c/defroutes routes
             (c/ANY "*" _
                    {:status  200
                     :headers {"Content-Type"    "text/html; charset=utf-8"}
                     :body    (io/input-stream (io/resource "public/index.html"))}))

(def handler
  (wrap-defaults routes (update site-defaults :security dissoc :frame-options)))