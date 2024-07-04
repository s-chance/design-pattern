package org.entropy;

import org.entropy.state.Article;

public class Application {
    public static void main(String[] args) {
        Article firstArticle = new Article();
        firstArticle.getState().commit();
        firstArticle.getState().reject();

        Article secondArticle = new Article();
        secondArticle.getState().commit();
        secondArticle.getState().accept();
    }
}
