# JavaFinalProject

File/Class Folder Purpose
MonopolyUI.java client/src/views/ UI that shows board, handles input
ClientConnection.java client/src/network/ Manages socket connection to server
GameServer.java server/src/app/ Listens for connections, game master
GameState.java shared/src/game/ Holds current board/player data
Player.java shared/src/player/ Player model (shared across both sides)



**FOR MACBOOK:**

(Created batch setup files)
brew install --cask powershell

Initial Setup and Compile:
cd Monopoly
pwsh -NoProfile -ExecutionPolicy Bypass -File ./compile-all.ps1

Run Server: (Monopoly folder)
java -cp
"shared/out:server/out:libs/sqlite-jdbc-3.43.2.0.jar:libs/slf4j-api-2.0.9.jar:libs/slf4j-simple-
2.0.9.jar" \monopoly.server.GameServer

Run Client (on each new window)
Create new terminal
cd to the client folder
java -cp out:../shared/out monopoly.client.MonopolyGUI localhost 5100




**FOR WINDOWS:**

cd server
javac -cp "../shared/out" -d out (Get-ChildItem -Recurse -Filter \*.java -Path src).FullName

java -cp "out;../shared/out" monopoly.server.GameServer

switch to new terminal windows

cd client
javac -cp "../shared/out" -d out (Get-ChildItem -Recurse -Filter \*.java -Path src).FullName

java -cp "out;../shared/out" monopoly.client.MonopolyGUI localhost 5100

$javaFiles = Get-ChildItem -Recurse -Filter \*.java -Path src | ForEach-Object { $\_.FullName }

> > javac -cp ../shared/out -d out $javaFiles

shared

javac -encoding UTF-8 -d out (Get-ChildItem -Recurse -Filter \*.java -Path src).FullName
