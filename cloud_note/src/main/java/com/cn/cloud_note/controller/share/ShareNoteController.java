package com.cn.cloud_note.controller.share;

import javax.annotation.Resource;

import com.cn.cloud_note.service.ShareService;
import com.cn.cloud_note.util.NoteResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/cloud_note/share")
public class ShareNoteController {
	@Resource
	private ShareService shareService;
	
	@RequestMapping("/share.do")
	@ResponseBody
	public NoteResult execute(String noteId){
		NoteResult result = 
			shareService.shareNote(noteId);
		return result;
	}
	
}
