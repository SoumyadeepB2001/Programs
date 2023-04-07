male(ronaldo).
male(messi).
female(rapinoe).
female(morgan).
likes(ronaldo,rapinoe).
girlfriend(X,Y):-male(X),female(Y),likes(X,Y).