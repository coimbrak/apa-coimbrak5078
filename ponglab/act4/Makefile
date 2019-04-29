JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Block.java \
	Locatable.java \
	Ball.java \
	Paddle.java \
	PaddleTestOne.java \
	PaddleTestTwo.java \
	Pong.java \
	Collidable.java \
	Wall.java \
	Tester.java \
	Score.java\
	TheGame.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
