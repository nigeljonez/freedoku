package cz.romario.opensudoku.gui.inputmethod;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import cz.romario.opensudoku.R;
import cz.romario.opensudoku.game.SudokuCell;
import cz.romario.opensudoku.game.SudokuGame;
import cz.romario.opensudoku.gui.SudokuBoardView;
import cz.romario.opensudoku.gui.SudokuBoardView.OnCellTappedListener;

/**
 * Base class for several input methods used to edit sudoku contents. 
 * 
 * @author romario
 *
 */
public abstract class InputMethod {
	
	public boolean enabled = true;
	
	private View mControlPanel;
	private String mInputMethodName;

	public InputMethod(Context context, SudokuGame game, SudokuBoardView board) {
		mInputMethodName = this.getClass().getSimpleName();
	}
	
	public boolean isControlPanelCreated() {
		return mControlPanel != null;
	}
	
	public View getControlPanel() {
		if (mControlPanel == null) {
			mControlPanel = createControlPanel();
			View switchModeButton = mControlPanel.findViewById(R.id.switch_input_mode);
			if (switchModeButton == null) {
				// TODO: exception
			}
			((Button)switchModeButton).setText(getAbbrName());
			onControlPanelCreated(mControlPanel);
		}
		
		return mControlPanel;
	}
	
	protected String getInputMethodName() {
		return mInputMethodName;
	}
	
	public abstract String getAbbrName();
	
	protected abstract View createControlPanel();
	
	protected void onControlPanelCreated(View controlPanel) {
		
	}
	
	protected void onActivated() {
		
	}
	
	protected void onDeactivated() {
		
	}
	
	/**
	 * Called when cell is selected. Please note that cell selection can
	 * change without direct user interaction.
	 * 
	 * @param cell
	 */
	protected void onCellSelected(SudokuCell cell) {
		
	}
	
	/**
	 * Called when cell is tapped.
	 * 
	 * @param cell
	 */
	protected void onCellTapped(SudokuCell cell) {
		
	}
	
	protected void onSaveInstanceState(Bundle outState) {
		
	}
	
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		
	}
	
	
}
