(ns leiningen.var-file
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(defn- file [project]
  (io/file (:root project) ".env-vars"))

(defn- normalize [s]
  (-> s
      name
      str/upper-case
      (str/replace "-" "_")))

(defn var-file
  "Create a file, '.env-vars', with environment variables."
  [project & args]
  (println "creating .env-vars file in" (:root project))
  (spit (file project)
        (str/join "\n" (for [[k v] (sort (:env project))]
                         (str (normalize k) \= v)))))
