(ns leiningen.var-file
  (:require [clojure.java.io :as io]
            [clojure.string :as string]))

(defn- file [project]
  (io/file (:root project) ".env-vars"))

(defn- env-var-name [s]
  (-> s
      name
      string/upper-case
      (string/replace "-" "_")))

(defn- map-to-env [env]
  (interleave (map env-var-name (keys env))
              (repeat "=")
              (vals env)
              (repeat "\n")))

(defn var-file
  "Create a file, '.env-vars', with environment variables."
  [project & args]
  (println "creating .env-vars file in" (:root project))
  (spit (file project)
        (apply str (map-to-env (:env project {})))))
