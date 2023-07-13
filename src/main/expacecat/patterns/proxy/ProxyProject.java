package main.expacecat.patterns.proxy;

public class ProxyProject implements Project {
    RealProject realProject;
    String urls;
    public ProxyProject(String url) {
        urls = url;
    }

    @Override
    public void run() {
        if(realProject == null) {
            realProject = new RealProject(urls);
        }
        realProject.run();
    }
}
