# ex1のファイル  
## 1.HelloWorld  
``` hello.scala``` ->　基本的な文法  
``` hello.scala
// 2017/09/05　<-コメント
/*
2017/09/05　　　<-コメント
*/
object hello {
	def main(args: Array[String]): Unit = { <-お決まりのおまじない
		println("hello scala")
		println("Scala!")
	}
}
```
## 2.色々な型  
|type |detail |
|:---------|:---------|  
| Byte|１バイト符号付き整数|
| Short|2バイト符号付き整数|
| Int|4バイト符号付き整数|
| Long|8バイト符号付き整数|
| Char|2バイト符号なしUnicode文字|
| String|charの連続した値|
| Float|4バイト単精度浮動小数点数|
| Double|8バイト単精度浮動小数点数|
| Boolean|true or false|
