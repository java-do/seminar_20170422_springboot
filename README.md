# seminar_20170422_springboot
for The Spring Boot Session


## 環境セットアップ

### Mavenプロジェクト作成

#### 以下のコマンドを実行
$ mvn -B archetype:generate  -DgroupId=jp.javado.springboot  -DartifactId=springboot-handson1  -Dversion=1.0  -DarchetypeArtifactId= maven-archetype-quickstart

#### 以下のフォルダ・ファイルができていることを確認
 - springboot-handson1
 - springboot-handson1/src
 - springboot-handson1/pom.xml

### 作成したプロジェクトを統合開発環境に取り込んでみよう

#### IntelliJ

- Import Project
 - springboot-handson1/pom.xml を選択
 - 上から3番目のImport Maven projects automatically にチェック
 - あとは指示に従ってNextしていく。（JDKの設定ができていることだけ注意）
 
#### NetBeans

- ファイル > プロジェクトを開く
  - springboot-handson1 を選択

#### Eclipse

- File > Import...（日本語化していれば ファイル > インポート）
  - Maven > Existing Maven Project  
（日本語化していれば、 Maven > 既存のMavenプロジェクト）
  - Browse > springboot-handson1 を選択
