package vazkii.patchouli.client.book.page;

import com.google.gson.annotations.SerializedName;
import com.mojang.blaze3d.matrix.MatrixStack;

import vazkii.patchouli.client.book.BookPage;
import vazkii.patchouli.client.book.gui.GuiBook;

public class PageEmpty extends BookPage {

	@SerializedName("draw_filler") boolean filler = true;

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float pticks) {
		if (filler) {
			GuiBook.drawPageFiller(ms, book, 0, 0);
		}
	}

}
