import static spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Heroes;
import models.Squads;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/about", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "about.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "heroForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("heroName");
            int age=Integer.parseInt(request.queryParams("heroAge"));
            String power=request.queryParams("heroPower");
            String weakness=request.queryParams("heroWeakness");
            Heroes heroes = new Heroes(name, age, power,weakness);
            model.put("heroes", heroes);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Heroes> heroes = Heroes.getAllInstances();
            model.put("heroes", heroes);
            return new ModelAndView(model, "heroes.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heroes/delete",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Heroes.clearAllHeroes();
            model.put("heroes",Heroes.getAllInstances());
            return new ModelAndView(model,"heroes.hbs");
        },new HandlebarsTemplateEngine());

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Heroes> heroes=Heroes.getAllInstances();
            ArrayList<Heroes> heroesList=new ArrayList<>();
            for (int i=0;i<heroes.size();i++){
                if(heroes.get(i).isSquadMember()){
                    heroesList.add(heroes.get(i));
                }
            }

            model.put("heroes",Heroes.getAllInstances());
            return new ModelAndView(model,"squadForm.hbs");
        }, new HandlebarsTemplateEngine());


    }
}