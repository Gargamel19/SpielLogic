package mammut.trenelenburg.de.client;

public class GameEngine implements Runnable {

	public boolean running = true;
	int fpsLocker = 60;

	public static final int TARGET_FPS = 75;

	public static final int TARGET_UPS = 30;

	private final Thread gameLoopThread;

	private final Timer timer;

	private final IGameLogic gameLogic;

	public final Window window;

	public GameEngine(String name, int hoehe, int weite, boolean vSync, IGameLogic gameLogic)
			throws Exception {

		gameLoopThread = new Thread(this, "LOOP_THREAD");
		window = new Window(name, hoehe, weite, vSync);
		this.gameLogic = gameLogic;
		this.timer = new Timer();

	}
	
	public void start() {
        String osName = System.getProperty("os.name");
        if ( osName.contains("Mac") ) {
            gameLoopThread.run();
        } else {
            gameLoopThread.start();
        }
    }

	@Override
	public void run() {

		init();

		gameloop();

	}

	private void gameloop() {
		float elapsedTime;
		float accumulator = 0f;
		float interval = 1f / TARGET_UPS;

		while (running && !window.windowShouldClose()) {
			elapsedTime = timer.getElapsedTime();
			accumulator += elapsedTime;

			
			manageInput();

			while (accumulator >= interval) {
				update(interval);
				accumulator -= interval;
			}

			render();

			if (!window.isvSync()) {
				sync();
			}
		}
	}

	private void sync() {
		

	}

	private void render() {
		// TODO Auto-generated method stub

	}

	private void update(float interval) {
		// TODO Auto-generated method stub

	}

	private void manageInput() {
		// TODO Auto-generated method stub

	}

	private void init() {
		// TODO Auto-generated method stub

	}

}
