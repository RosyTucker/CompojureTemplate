(ns example.templates
  (:require [clostache.parser :as clostache]))

(defn read-template-file [template-name]
  (slurp (clojure.java.io/resource
           (str "templates/" template-name ".tash.html"))))

(defn render-template [template-name params]
  (clostache/render (read-template-file template-name) params))