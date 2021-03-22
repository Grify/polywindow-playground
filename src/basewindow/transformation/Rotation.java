package basewindow.transformation;

import basewindow.BaseWindow;

public class Rotation extends Transformation
{
	public double yaw;
	public double pitch;
	public double roll;

	public Rotation(BaseWindow window, double yaw, double pitch, double roll)
	{
		super(window);
		this.yaw = yaw;
		this.pitch = pitch;
		this.roll = roll;
	}

	public void apply()
	{
		this.applyToWindow();
		transform(window, yaw, pitch, roll);
	}

	@Override
	public void applyToWindow()
	{
		window.yaw += yaw;
		window.pitch += pitch;
		window.roll += roll;
		window.calculateBillboard();
	}

	public static void transform(BaseWindow window, double yaw, double pitch, double roll)
	{
		transform(window, Math.cos(roll), -Math.sin(roll), 0, 0,  Math.sin(roll), Math.cos(roll), 0, 0,  0, 0, 1, 0,  0, 0, 0, 1);
		transform(window, 1, 0, 0, 0,  0, Math.cos(pitch), -Math.sin(pitch), 0,  0, Math.sin(pitch), Math.cos(pitch), 0,  0, 0, 0, 1);
		transform(window, Math.cos(yaw), 0, -Math.sin(yaw), 0,  0, 1, 0, 0,  Math.sin(yaw), 0, Math.cos(yaw), 0,  0, 0, 0, 1);
	}
}
