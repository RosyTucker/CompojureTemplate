(ns example.test.routes
  (:require [clojure.test :refer :all]
            [example.routes :refer :all]
            [ring.mock.request :as mock]
            [example.templates :as templates]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) (templates/render-template "home" {:message "Hello World"})))))
  
  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
