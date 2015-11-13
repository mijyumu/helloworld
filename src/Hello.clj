(ns hello.hello)
;https://clojuredocs.org/
;http://passingloop.tumblr.com/post/11285441971/7l7w-clojure-day-1-note
;http://ayato-p.github.io/clojure-beginner/getting_started/intellij_with_cursive/repl.html

;インポート ワイルドカードは？
;(import '(javax.swing *))
(import '(javax.swing JOptionPane))

;関数定義
(defn hoge [a b c] (+ a b c))
;グローバル変数
(def fuga "ふが")

;上から順に実行される
(println (.toLowerCase "HELLO") "Hello" fuga)
(println (str (< 1 3 5 3) "aaa" 45.6 "あうい"))
(JOptionPane/showMessageDialog nil (hoge 1 2 3))
(println "９９９" (def fuga "ふがが") fuga)




